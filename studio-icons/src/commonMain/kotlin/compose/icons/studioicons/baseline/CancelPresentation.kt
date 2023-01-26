package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CancelPresentation: ImageVector
    get() {
        if (_cancelPresentation != null) {
            return _cancelPresentation!!
        }
        _cancelPresentation = Builder(name = "CancelPresentation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.1f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.1f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.59f, 8.0f)
                lineTo(12.0f, 10.59f)
                lineTo(9.41f, 8.0f)
                lineTo(8.0f, 9.41f)
                lineTo(10.59f, 12.0f)
                lineTo(8.0f, 14.59f)
                lineTo(9.41f, 16.0f)
                lineTo(12.0f, 13.41f)
                lineTo(14.59f, 16.0f)
                lineTo(16.0f, 14.59f)
                lineTo(13.41f, 12.0f)
                lineTo(16.0f, 9.41f)
                close()
            }
        }
        .build()
        return _cancelPresentation!!
    }

private var _cancelPresentation: ImageVector? = null
