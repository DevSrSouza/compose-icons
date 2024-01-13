package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Thurgauerkantonalbank: ImageVector
    get() {
        if (_thurgauerkantonalbank != null) {
            return _thurgauerkantonalbank!!
        }
        _thurgauerkantonalbank = Builder(name = "Thurgauerkantonalbank", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.872f, 2.262f)
                lineTo(10.775f, 2.262f)
                lineToRelative(-6.14f, 9.743f)
                lineToRelative(6.14f, 9.771f)
                horizontalLineToRelative(11.097f)
                lineToRelative(-6.135f, -9.77f)
                lineToRelative(6.135f, -9.744f)
                close()
                moveTo(0.0f, 0.297f)
                verticalLineToRelative(23.406f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.297f)
                lineTo(0.0f, 0.297f)
                close()
                moveTo(23.057f, 22.783f)
                lineTo(0.943f, 22.778f)
                lineTo(0.943f, 1.228f)
                horizontalLineToRelative(22.109f)
                lineToRelative(0.005f, 21.555f)
                close()
            }
        }
        .build()
        return _thurgauerkantonalbank!!
    }

private var _thurgauerkantonalbank: ImageVector? = null
