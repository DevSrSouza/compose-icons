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

public val SimpleIcons.Chatwoot: ImageVector
    get() {
        if (_chatwoot != null) {
            return _chatwoot!!
        }
        _chatwoot = Builder(name = "Chatwoot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.629f, 5.371f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.371f, 12.0f, -12.0f)
                reflectiveCurveTo(18.629f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.371f, 0.0f, 12.0f)
                moveToRelative(17.008f, 5.29f)
                horizontalLineTo(11.44f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, -5.562f, -5.567f)
                arcTo(5.57f, 5.57f, 0.0f, false, true, 11.44f, 6.16f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, 5.567f, 5.563f)
                close()
            }
        }
        .build()
        return _chatwoot!!
    }

private var _chatwoot: ImageVector? = null
