package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.47f, 10.42f)
                lineToRelative(3.07f, 9.22f)
                curveTo(5.82f, 20.45f, 6.58f, 21.0f, 7.44f, 21.0f)
                horizontalLineToRelative(9.12f)
                curveToRelative(0.86f, 0.0f, 1.63f, -0.55f, 1.9f, -1.37f)
                lineToRelative(3.07f, -9.22f)
                curveToRelative(0.28f, -0.84f, -0.03f, -1.76f, -0.75f, -2.27f)
                lineTo(13.15f, 2.8f)
                curveToRelative(-0.69f, -0.48f, -1.61f, -0.48f, -2.29f, 0.0f)
                lineTo(3.22f, 8.14f)
                curveTo(2.5f, 8.65f, 2.19f, 9.58f, 2.47f, 10.42f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
