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

public val SimpleIcons.Nextcloud: ImageVector
    get() {
        if (_nextcloud != null) {
            return _nextcloud!!
        }
        _nextcloud = Builder(name = "Nextcloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.018f, 6.537f)
                curveToRelative(-2.5f, 0.0f, -4.6f, 1.712f, -5.241f, 4.015f)
                curveToRelative(-0.56f, -1.232f, -1.793f, -2.105f, -3.225f, -2.105f)
                arcTo(3.569f, 3.569f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(3.569f, 3.569f, 0.0f, false, false, 3.552f, 3.553f)
                curveToRelative(1.432f, 0.0f, 2.664f, -0.874f, 3.224f, -2.106f)
                curveToRelative(0.641f, 2.304f, 2.742f, 4.016f, 5.242f, 4.016f)
                curveToRelative(2.487f, 0.0f, 4.576f, -1.693f, 5.231f, -3.977f)
                curveToRelative(0.569f, 1.21f, 1.783f, 2.067f, 3.198f, 2.067f)
                arcTo(3.568f, 3.568f, 0.0f, false, false, 24.0f, 12.0f)
                arcToRelative(3.569f, 3.569f, 0.0f, false, false, -3.553f, -3.553f)
                curveToRelative(-1.416f, 0.0f, -2.63f, 0.858f, -3.199f, 2.067f)
                curveToRelative(-0.654f, -2.284f, -2.743f, -3.978f, -5.23f, -3.977f)
                close()
                moveTo(12.018f, 8.622f)
                curveToRelative(1.878f, 0.0f, 3.378f, 1.5f, 3.378f, 3.378f)
                curveToRelative(0.0f, 1.878f, -1.5f, 3.378f, -3.378f, 3.378f)
                arcTo(3.362f, 3.362f, 0.0f, false, true, 8.641f, 12.0f)
                curveToRelative(0.0f, -1.878f, 1.5f, -3.378f, 3.377f, -3.378f)
                close()
                moveTo(3.552f, 10.532f)
                curveToRelative(0.822f, 0.0f, 1.467f, 0.645f, 1.467f, 1.468f)
                reflectiveCurveToRelative(-0.644f, 1.467f, -1.467f, 1.468f)
                arcTo(1.452f, 1.452f, 0.0f, false, true, 2.085f, 12.0f)
                curveToRelative(0.0f, -0.823f, 0.644f, -1.467f, 1.467f, -1.467f)
                close()
                moveTo(20.447f, 10.532f)
                curveToRelative(0.823f, 0.0f, 1.468f, 0.645f, 1.468f, 1.468f)
                reflectiveCurveToRelative(-0.645f, 1.468f, -1.468f, 1.468f)
                arcTo(1.452f, 1.452f, 0.0f, false, true, 18.98f, 12.0f)
                curveToRelative(0.0f, -0.823f, 0.644f, -1.467f, 1.467f, -1.467f)
                close()
            }
        }
        .build()
        return _nextcloud!!
    }

private var _nextcloud: ImageVector? = null
