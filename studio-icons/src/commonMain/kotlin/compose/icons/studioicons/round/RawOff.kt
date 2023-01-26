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

public val RoundGroup.RawOff: ImageVector
    get() {
        if (_rawOff != null) {
            return _rawOff!!
        }
        _rawOff = Builder(name = "RawOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.55f, 9.0f)
                curveToRelative(-0.33f, 0.0f, -0.63f, 0.23f, -0.71f, 0.55f)
                lineTo(19.24f, 12.0f)
                lineToRelative(-0.56f, -2.26f)
                curveTo(18.58f, 9.3f, 18.19f, 9.0f, 17.74f, 9.0f)
                reflectiveCurveTo(16.9f, 9.3f, 16.8f, 9.74f)
                lineTo(16.24f, 12.0f)
                lineToRelative(-0.6f, -2.45f)
                curveTo(15.56f, 9.23f, 15.27f, 9.0f, 14.93f, 9.0f)
                curveToRelative(-0.47f, 0.0f, -0.82f, 0.44f, -0.71f, 0.9f)
                lineToRelative(0.5f, 1.99f)
                lineToRelative(2.42f, 2.42f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f)
                lineToRelative(0.58f, -2.32f)
                lineToRelative(0.58f, 2.32f)
                curveTo(18.43f, 14.7f, 18.81f, 15.0f, 19.24f, 15.0f)
                reflectiveCurveToRelative(0.81f, -0.3f, 0.92f, -0.72f)
                lineToRelative(1.09f, -4.38f)
                curveTo(21.37f, 9.44f, 21.02f, 9.0f, 20.55f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(6.17f, 9.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.31f)
                curveTo(3.0f, 14.69f, 3.31f, 15.0f, 3.69f, 15.0f)
                horizontalLineToRelative(0.11f)
                curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.1f)
                lineToRelative(0.72f, 1.59f)
                curveTo(6.43f, 14.84f, 6.68f, 15.0f, 6.95f, 15.0f)
                curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f)
                lineTo(7.1f, 12.9f)
                curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f)
                verticalLineToRelative(-0.67f)
                lineToRelative(1.43f, 1.43f)
                lineTo(8.98f, 14.1f)
                curveTo(8.86f, 14.56f, 9.21f, 15.0f, 9.68f, 15.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.33f, 0.0f, 0.62f, -0.23f, 0.7f, -0.55f)
                lineToRelative(0.24f, -0.95f)
                horizontalLineToRelative(0.04f)
                lineToRelative(8.4f, 8.4f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                close()
                moveTo(6.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _rawOff!!
    }

private var _rawOff: ImageVector? = null
