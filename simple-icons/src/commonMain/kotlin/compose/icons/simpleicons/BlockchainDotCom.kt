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

public val SimpleIcons.Blockchaindotcom: ImageVector
    get() {
        if (_blockchaindotcom != null) {
            return _blockchaindotcom!!
        }
        _blockchaindotcom = Builder(name = "Blockchaindotcom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8285f, 6.6117f)
                lineToRelative(-5.52f, -5.535f)
                arcToRelative(3.1352f, 3.1352f, 0.0f, false, false, -4.5f, 0.0f)
                lineToRelative(-5.535f, 5.535f)
                lineToRelative(7.755f, 3.87f)
                close()
                moveTo(21.9465f, 8.8467f)
                lineToRelative(1.095f, 1.095f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, 0.0f, 4.5f)
                lineTo(14.22f, 23.3502f)
                arcToRelative(2.6846f, 2.6846f, 0.0f, false, true, -0.72f, 0.525f)
                lineTo(13.5f, 13.0767f)
                close()
                moveTo(2.0535f, 8.8467f)
                lineToRelative(-1.095f, 1.095f)
                arcToRelative(3.1198f, 3.1198f, 0.0f, false, false, 0.0f, 4.5f)
                lineTo(9.78f, 23.3502f)
                curveToRelative(0.2091f, 0.214f, 0.4525f, 0.3914f, 0.72f, 0.525f)
                lineTo(10.5f, 13.0767f)
                close()
            }
        }
        .build()
        return _blockchaindotcom!!
    }

private var _blockchaindotcom: ImageVector? = null
