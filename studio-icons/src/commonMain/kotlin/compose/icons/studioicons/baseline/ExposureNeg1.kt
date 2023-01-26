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

public val BaselineGroup.ExposureNeg1: ImageVector
    get() {
        if (_exposureNeg1 != null) {
            return _exposureNeg1!!
        }
        _exposureNeg1 = Builder(name = "ExposureNeg1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 11.0f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 7.38f)
                lineTo(14.0f, 8.4f)
                lineTo(14.0f, 6.7f)
                lineTo(18.7f, 5.0f)
                horizontalLineToRelative(0.3f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _exposureNeg1!!
    }

private var _exposureNeg1: ImageVector? = null
