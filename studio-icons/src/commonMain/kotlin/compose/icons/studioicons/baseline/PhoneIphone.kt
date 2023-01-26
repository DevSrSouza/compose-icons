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

public val BaselineGroup.PhoneIphone: ImageVector
    get() {
        if (_phoneIphone != null) {
            return _phoneIphone!!
        }
        _phoneIphone = Builder(name = "PhoneIphone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f)
                verticalLineToRelative(17.0f)
                curveTo(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-17.0f)
                curveTo(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f)
                close()
                moveTo(11.5f, 22.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _phoneIphone!!
    }

private var _phoneIphone: ImageVector? = null
