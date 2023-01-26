package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FormatListNumberedRtl: ImageVector
    get() {
        if (_formatListNumberedRtl != null) {
            return _formatListNumberedRtl!!
        }
        _formatListNumberedRtl = Builder(name = "FormatListNumberedRtl", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(1.8f)
                lineTo(18.0f, 13.1f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(1.8f, -2.1f)
                lineTo(21.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(2.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(2.0f, 17.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 19.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.0f)
                close()
            }
        }
        .build()
        return _formatListNumberedRtl!!
    }

private var _formatListNumberedRtl: ImageVector? = null
