package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.CancelPresentation: ImageVector
    get() {
        if (_cancelPresentation != null) {
            return _cancelPresentation!!
        }
        _cancelPresentation = Builder(name = "CancelPresentation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(9.41f, 15.95f)
                lineTo(12.0f, 13.36f)
                lineToRelative(2.59f, 2.59f)
                lineTo(16.0f, 14.54f)
                lineToRelative(-2.59f, -2.59f)
                lineTo(16.0f, 9.36f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(12.0f, 10.54f)
                lineTo(9.41f, 7.95f)
                lineTo(8.0f, 9.36f)
                lineToRelative(2.59f, 2.59f)
                lineTo(8.0f, 14.54f)
                close()
            }
        }
        .build()
        return _cancelPresentation!!
    }

private var _cancelPresentation: ImageVector? = null
