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

public val SimpleIcons.Baremetrics: ImageVector
    get() {
        if (_baremetrics != null) {
            return _baremetrics!!
        }
        _baremetrics = Builder(name = "Baremetrics", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.109f, 7.951f)
                lineToRelative(1.485f, 2.464f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, true, 0.0f, 3.275f)
                lineToRelative(-4.505f, 7.717f)
                arcToRelative(3.333f, 3.333f, 0.0f, false, true, -2.94f, 1.793f)
                lineTo(7.83f, 23.2f)
                arcToRelative(3.335f, 3.335f, 0.0f, false, true, -2.94f, -1.793f)
                lineToRelative(-1.555f, -2.632f)
                lineToRelative(6.139f, -5.695f)
                lineToRelative(4.447f, 2.578f)
                arcToRelative(1.093f, 1.093f, 0.0f, false, false, 1.456f, -0.198f)
                close()
                moveTo(8.719f, 8.579f)
                lineTo(1.99f, 16.15f)
                lineTo(0.406f, 13.725f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, true, 0.0f, -3.27f)
                lineTo(5.158f, 2.59f)
                arcTo(3.338f, 3.338f, 0.0f, false, true, 8.1f, 0.8f)
                horizontalLineToRelative(8.008f)
                curveToRelative(1.228f, 0.0f, 2.357f, 0.687f, 2.942f, 1.79f)
                lineToRelative(1.616f, 2.722f)
                lineToRelative(-6.017f, 5.592f)
                lineToRelative(-4.432f, -2.574f)
                arcToRelative(1.098f, 1.098f, 0.0f, false, false, -1.499f, 0.248f)
                close()
            }
        }
        .build()
        return _baremetrics!!
    }

private var _baremetrics: ImageVector? = null
