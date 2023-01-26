package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Unsubscribe: ImageVector
    get() {
        if (_unsubscribe != null) {
            return _unsubscribe!!
        }
        _unsubscribe = Builder(name = "Unsubscribe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.99f, 14.04f)
                lineTo(20.99f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.05f)
                curveToRelative(0.28f, 1.92f, 2.1f, 3.35f, 4.18f, 2.93f)
                curveToRelative(1.34f, -0.27f, 2.43f, -1.37f, 2.7f, -2.71f)
                curveToRelative(0.25f, -1.24f, -0.16f, -2.39f, -0.94f, -3.18f)
                close()
                moveTo(18.99f, 5.0f)
                lineTo(12.0f, 8.5f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(13.99f)
                close()
                moveTo(15.35f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 7.0f)
                lineToRelative(7.0f, 3.5f)
                lineTo(19.0f, 7.0f)
                verticalLineToRelative(6.05f)
                curveToRelative(-0.16f, -0.02f, -0.33f, -0.05f, -0.5f, -0.05f)
                curveToRelative(-1.39f, 0.0f, -2.59f, 0.82f, -3.15f, 2.0f)
                close()
                moveTo(20.5f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _unsubscribe!!
    }

private var _unsubscribe: ImageVector? = null
