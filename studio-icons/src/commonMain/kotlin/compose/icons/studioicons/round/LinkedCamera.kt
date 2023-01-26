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

public val RoundGroup.LinkedCamera: ImageVector
    get() {
        if (_linkedCamera != null) {
            return _linkedCamera!!
        }
        _linkedCamera = Builder(name = "LinkedCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6f, 2.37f)
                curveToRelative(2.1f, 0.27f, 3.77f, 1.93f, 4.03f, 4.03f)
                curveTo(20.67f, 6.74f, 20.95f, 7.0f, 21.29f, 7.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.0f, 0.71f, -0.34f, 0.66f, -0.73f)
                curveToRelative(-0.33f, -2.72f, -2.5f, -4.89f, -5.22f, -5.22f)
                curveTo(16.34f, 1.0f, 16.0f, 1.32f, 16.0f, 1.71f)
                lineToRelative(0.0f, 0.0f)
                curveTo(16.0f, 2.05f, 16.26f, 2.33f, 16.6f, 2.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.23f, 6.19f)
                curveTo(18.93f, 5.0f, 18.0f, 4.07f, 16.81f, 3.77f)
                curveTo(16.4f, 3.67f, 16.0f, 3.99f, 16.0f, 4.42f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 0.29f, 0.19f, 0.57f, 0.48f, 0.64f)
                curveToRelative(0.72f, 0.18f, 1.29f, 0.74f, 1.46f, 1.46f)
                curveTo(18.01f, 6.81f, 18.28f, 7.0f, 18.58f, 7.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(19.01f, 7.0f, 19.33f, 6.6f, 19.23f, 6.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(9.88f)
                curveTo(9.32f, 3.0f, 8.78f, 3.24f, 8.4f, 3.65f)
                lineTo(7.17f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveTo(9.52f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveTo(14.48f, 17.5f, 12.0f, 17.5f)
                close()
            }
        }
        .build()
        return _linkedCamera!!
    }

private var _linkedCamera: ImageVector? = null
