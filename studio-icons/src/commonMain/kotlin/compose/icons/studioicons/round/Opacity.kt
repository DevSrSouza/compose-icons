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

public val RoundGroup.Opacity: ImageVector
    get() {
        if (_opacity != null) {
            return _opacity!!
        }
        _opacity = Builder(name = "Opacity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.65f, 7.56f)
                lineTo(17.65f, 7.56f)
                lineTo(12.7f, 2.69f)
                curveToRelative(-0.39f, -0.38f, -1.01f, -0.38f, -1.4f, 0.0f)
                lineTo(6.35f, 7.56f)
                lineToRelative(0.0f, 0.0f)
                curveTo(4.9f, 8.99f, 4.0f, 10.96f, 4.0f, 13.13f)
                curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.52f, 8.0f, -7.87f)
                curveTo(20.0f, 10.96f, 19.1f, 8.99f, 17.65f, 7.56f)
                close()
                moveTo(7.75f, 8.99f)
                lineTo(12.0f, 4.81f)
                lineToRelative(4.25f, 4.18f)
                curveToRelative(0.88f, 0.87f, 2.04f, 2.59f, 1.67f, 5.01f)
                horizontalLineTo(6.07f)
                curveTo(5.7f, 11.58f, 6.87f, 9.85f, 7.75f, 8.99f)
                close()
            }
        }
        .build()
        return _opacity!!
    }

private var _opacity: ImageVector? = null
