package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.MicExternalOff: ImageVector
    get() {
        if (_micExternalOff != null) {
            return _micExternalOff!!
        }
        _micExternalOff = Builder(name = "MicExternalOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                curveToRelative(0.0f, -1.24f, 1.14f, -2.22f, 2.42f, -1.96f)
                curveTo(17.36f, 4.24f, 18.0f, 5.13f, 18.0f, 6.09f)
                verticalLineToRelative(9.08f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(6.16f)
                curveToRelative(0.0f, -2.08f, -1.68f, -4.03f, -3.76f, -4.15f)
                curveTo(13.92f, 1.87f, 12.0f, 3.71f, 12.0f, 6.0f)
                verticalLineToRelative(3.17f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                curveTo(6.38f, 2.0f, 5.81f, 2.19f, 5.33f, 2.5f)
                lineToRelative(4.15f, 4.15f)
                curveTo(9.8f, 6.18f, 10.0f, 5.61f, 10.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 2.81f)
                lineTo(1.39f, 2.81f)
                curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f)
                lineTo(5.17f, 8.0f)
                horizontalLineTo(5.1f)
                curveToRelative(-0.59f, 0.0f, -1.05f, 0.51f, -1.0f, 1.1f)
                lineToRelative(0.85f, 8.45f)
                curveTo(4.98f, 17.81f, 5.2f, 18.0f, 5.45f, 18.0f)
                horizontalLineTo(6.0f)
                curveToRelative(0.0f, 2.34f, 2.01f, 4.21f, 4.39f, 3.98f)
                curveToRelative(2.08f, -0.2f, 3.61f, -2.06f, 3.61f, -4.15f)
                lineToRelative(0.0f, -1.0f)
                lineToRelative(5.78f, 5.78f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(2.81f, 2.81f)
                curveTo(2.42f, 2.42f, 1.78f, 2.42f, 1.39f, 2.81f)
                close()
                moveTo(12.0f, 17.91f)
                curveToRelative(0.0f, 0.96f, -0.64f, 1.86f, -1.58f, 2.05f)
                curveTo(9.14f, 20.22f, 8.0f, 19.24f, 8.0f, 18.0f)
                horizontalLineToRelative(0.55f)
                curveToRelative(0.26f, 0.0f, 0.47f, -0.19f, 0.5f, -0.45f)
                lineToRelative(0.52f, -5.16f)
                lineTo(12.0f, 14.83f)
                verticalLineTo(17.91f)
                close()
            }
        }
        .build()
        return _micExternalOff!!
    }

private var _micExternalOff: ImageVector? = null
