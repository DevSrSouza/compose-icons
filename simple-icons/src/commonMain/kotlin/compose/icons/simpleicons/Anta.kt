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

public val SimpleIcons.Anta: ImageVector
    get() {
        if (_anta != null) {
            return _anta!!
        }
        _anta = Builder(name = "Anta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.2372f)
                arcToRelative(20.744f, 20.744f, 0.0f, false, false, -9.86f, -7.5087f)
                arcToRelative(31.2657f, 31.2657f, 0.0f, false, true, 6.9097f, 1.0135f)
                lineToRelative(-1.5536f, -1.3192f)
                arcTo(29.1614f, 29.1614f, 0.0f, false, false, 9.0497f, 5.509f)
                arcToRelative(29.0797f, 29.0797f, 0.0f, false, false, -6.4051f, 0.7036f)
                lineTo(0.0f, 8.032f)
                curveToRelative(0.335f, 0.0f, 0.8376f, -0.021f, 1.1747f, -0.021f)
                arcToRelative(25.1537f, 25.1537f, 0.0f, false, true, 20.4571f, 10.48f)
                close()
                moveTo(9.1963f, 12.9758f)
                horizontalLineToRelative(3.3334f)
                lineToRelative(-0.3329f, 1.183f)
                horizontalLineToRelative(-1.0532f)
                lineTo(9.9333f, 18.491f)
                lineTo(8.7692f, 18.491f)
                lineToRelative(1.206f, -4.3322f)
                lineTo(8.8655f, 14.1588f)
                close()
                moveTo(5.4253f, 12.9758f)
                lineTo(6.468f, 12.9758f)
                lineToRelative(0.4376f, 2.9544f)
                lineToRelative(0.8229f, -2.9544f)
                horizontalLineToRelative(1.1977f)
                lineToRelative(-1.537f, 5.5152f)
                lineTo(6.221f, 18.491f)
                lineToRelative(-0.4041f, -2.743f)
                lineToRelative(-0.7643f, 2.743f)
                lineTo(3.8841f, 18.491f)
                close()
                moveTo(0.0f, 18.491f)
                lineToRelative(2.8225f, -5.5131f)
                horizontalLineToRelative(1.181f)
                lineTo(3.769f, 18.491f)
                lineTo(2.5838f, 18.491f)
                lineToRelative(0.0545f, -0.7391f)
                lineTo(1.5264f, 17.7519f)
                lineToRelative(-0.3601f, 0.7391f)
                close()
                moveTo(2.0206f, 16.6066f)
                horizontalLineToRelative(0.6889f)
                lineToRelative(0.2094f, -1.9474f)
                close()
                moveTo(10.2328f, 18.491f)
                lineTo(13.0616f, 12.9779f)
                horizontalLineToRelative(1.1768f)
                lineToRelative(-0.2346f, 5.5131f)
                horizontalLineToRelative(-1.181f)
                lineToRelative(0.0524f, -0.7391f)
                horizontalLineToRelative(-1.1076f)
                lineToRelative(-0.3644f, 0.7391f)
                close()
                moveTo(12.2575f, 16.6066f)
                horizontalLineToRelative(0.689f)
                lineToRelative(0.2093f, -1.9474f)
                close()
            }
        }
        .build()
        return _anta!!
    }

private var _anta: ImageVector? = null
