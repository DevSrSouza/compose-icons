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

public val TwotoneGroup.BatchPrediction: ImageVector
    get() {
        if (_batchPrediction != null) {
            return _batchPrediction!!
        }
        _batchPrediction = Builder(name = "BatchPrediction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 20.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(20.5f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveTo(15.5f, 15.0f, 13.0f, 16.5f, 13.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(10.0f)
                curveTo(19.0f, 8.9f, 18.1f, 8.0f, 17.0f, 8.0f)
                close()
                moveTo(13.0f, 20.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(20.5f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveTo(15.5f, 15.0f, 13.0f, 16.5f, 13.0f, 18.0f)
                close()
                moveTo(18.0f, 6.5f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(0.0f)
                curveTo(6.0f, 5.67f, 6.67f, 5.0f, 7.5f, 5.0f)
                horizontalLineToRelative(9.0f)
                curveTo(17.33f, 5.0f, 18.0f, 5.67f, 18.0f, 6.5f)
                lineTo(18.0f, 6.5f)
                close()
                moveTo(17.0f, 3.5f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(0.0f)
                curveTo(7.0f, 2.67f, 7.67f, 2.0f, 8.5f, 2.0f)
                horizontalLineToRelative(7.0f)
                curveTo(16.33f, 2.0f, 17.0f, 2.67f, 17.0f, 3.5f)
                lineTo(17.0f, 3.5f)
                close()
            }
        }
        .build()
        return _batchPrediction!!
    }

private var _batchPrediction: ImageVector? = null
