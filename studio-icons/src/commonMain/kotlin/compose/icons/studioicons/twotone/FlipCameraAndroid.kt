package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.FlipCameraAndroid: ImageVector
    get() {
        if (_flipCameraAndroid != null) {
            return _flipCameraAndroid!!
        }
        _flipCameraAndroid = Builder(name = "FlipCameraAndroid", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 10.34f, 9.0f, 12.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveTo(13.0f, 11.45f, 13.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                horizontalLineTo(5.09f)
                curveTo(6.47f, 5.61f, 9.05f, 4.0f, 12.0f, 4.0f)
                curveToRelative(3.72f, 0.0f, 6.85f, 2.56f, 7.74f, 6.0f)
                horizontalLineToRelative(2.06f)
                curveToRelative(-0.93f, -4.56f, -4.96f, -8.0f, -9.8f, -8.0f)
                curveTo(8.73f, 2.0f, 5.82f, 3.58f, 4.0f, 6.01f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.91f)
                curveToRelative(-1.38f, 2.39f, -3.96f, 4.0f, -6.91f, 4.0f)
                curveToRelative(-3.72f, 0.0f, -6.85f, -2.56f, -7.74f, -6.0f)
                horizontalLineTo(2.2f)
                curveToRelative(0.93f, 4.56f, 4.96f, 8.0f, 9.8f, 8.0f)
                curveToRelative(3.27f, 0.0f, 6.18f, -1.58f, 8.0f, -4.01f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _flipCameraAndroid!!
    }

private var _flipCameraAndroid: ImageVector? = null
