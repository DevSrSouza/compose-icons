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

public val RoundGroup.FlipCameraAndroid: ImageVector
    get() {
        if (_flipCameraAndroid != null) {
            return _flipCameraAndroid!!
        }
        _flipCameraAndroid = Builder(name = "FlipCameraAndroid", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 10.34f, 9.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(5.09f)
                curveTo(6.47f, 5.61f, 9.05f, 4.0f, 12.0f, 4.0f)
                curveToRelative(3.49f, 0.0f, 6.45f, 2.24f, 7.54f, 5.36f)
                curveTo(19.68f, 9.75f, 20.07f, 10.0f, 20.48f, 10.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.68f, 0.0f, 1.18f, -0.67f, 0.96f, -1.31f)
                curveTo(20.07f, 4.79f, 16.36f, 2.0f, 12.0f, 2.0f)
                curveTo(8.73f, 2.0f, 5.82f, 3.58f, 4.0f, 6.01f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(2.45f, 4.0f, 2.0f, 4.45f, 2.0f, 5.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveTo(7.55f, 10.0f, 8.0f, 9.55f, 8.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.91f)
                curveToRelative(-1.38f, 2.39f, -3.96f, 4.0f, -6.91f, 4.0f)
                curveToRelative(-3.49f, 0.0f, -6.45f, -2.24f, -7.54f, -5.36f)
                curveTo(4.32f, 14.25f, 3.93f, 14.0f, 3.52f, 14.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.68f, 0.0f, -1.18f, 0.67f, -0.96f, 1.31f)
                curveTo(3.93f, 19.21f, 7.64f, 22.0f, 12.0f, 22.0f)
                curveToRelative(3.27f, 0.0f, 6.18f, -1.58f, 8.0f, -4.01f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(16.45f, 14.0f, 16.0f, 14.45f, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _flipCameraAndroid!!
    }

private var _flipCameraAndroid: ImageVector? = null
