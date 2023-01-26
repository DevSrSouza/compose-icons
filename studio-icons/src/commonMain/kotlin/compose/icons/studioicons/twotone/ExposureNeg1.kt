package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ExposureNeg1: ImageVector
    get() {
        if (_exposureNeg1 != null) {
            return _exposureNeg1!!
        }
        _exposureNeg1 = Builder(name = "ExposureNeg1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-0.3f)
                lineTo(14.0f, 6.7f)
                verticalLineToRelative(1.7f)
                lineToRelative(3.0f, -1.02f)
                verticalLineTo(18.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _exposureNeg1!!
    }

private var _exposureNeg1: ImageVector? = null
