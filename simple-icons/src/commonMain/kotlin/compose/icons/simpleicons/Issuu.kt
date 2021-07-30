package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Issuu: ImageVector
    get() {
        if (_issuu != null) {
            return _issuu!!
        }
        _issuu = Builder(name = "Issuu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.996f, 0.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 0.0f, 0.996f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                lineTo(0.996f, 0.0f)
                close()
                moveTo(12.166f, 3.582f)
                arcToRelative(8.333f, 8.333f, 0.0f, false, true, 8.254f, 8.41f)
                arcToRelative(8.333f, 8.333f, 0.0f, false, true, -8.41f, 8.252f)
                curveToRelative(-4.597f, -0.045f, -8.296f, -3.81f, -8.254f, -8.41f)
                curveToRelative(0.045f, -4.6f, 3.81f, -8.296f, 8.41f, -8.252f)
                close()
                moveTo(12.135f, 5.852f)
                arcToRelative(6.107f, 6.107f, 0.0f, false, false, -6.155f, 6.046f)
                arcToRelative(6.109f, 6.109f, 0.0f, false, false, 6.05f, 6.163f)
                arcToRelative(6.099f, 6.099f, 0.0f, false, false, 6.154f, -6.047f)
                arcToRelative(6.107f, 6.107f, 0.0f, false, false, -6.041f, -6.162f)
                horizontalLineToRelative(-0.008f)
                close()
                moveTo(12.115f, 8.865f)
                arcToRelative(3.098f, 3.098f, 0.0f, false, true, 3.063f, 3.123f)
                arcToRelative(3.088f, 3.088f, 0.0f, false, true, -3.121f, 3.06f)
                lineToRelative(0.002f, -0.001f)
                arcToRelative(3.091f, 3.091f, 0.0f, false, true, 0.056f, -6.182f)
                close()
            }
        }
        .build()
        return _issuu!!
    }

private var _issuu: ImageVector? = null
