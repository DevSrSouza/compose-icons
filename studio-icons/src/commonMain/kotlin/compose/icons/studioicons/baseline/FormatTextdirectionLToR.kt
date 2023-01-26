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

public val BaselineGroup.FormatTextdirectionLToR: ImageVector
    get() {
        if (_formatTextdirectionLToR != null) {
            return _formatTextdirectionLToR!!
        }
        _formatTextdirectionLToR = Builder(name = "FormatTextdirectionLToR", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                curveTo(6.79f, 2.0f, 5.0f, 3.79f, 5.0f, 6.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(21.0f, 18.0f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _formatTextdirectionLToR!!
    }

private var _formatTextdirectionLToR: ImageVector? = null
