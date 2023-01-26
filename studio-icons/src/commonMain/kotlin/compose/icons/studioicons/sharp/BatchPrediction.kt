package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.BatchPrediction: ImageVector
    get() {
        if (_batchPrediction != null) {
            return _batchPrediction!!
        }
        _batchPrediction = Builder(name = "BatchPrediction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(8.0f)
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
                verticalLineTo(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(6.5f)
                close()
                moveTo(17.0f, 3.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _batchPrediction!!
    }

private var _batchPrediction: ImageVector? = null
