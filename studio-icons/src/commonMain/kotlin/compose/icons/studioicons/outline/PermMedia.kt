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

public val OutlineGroup.PermMedia: ImageVector
    get() {
        if (_permMedia != null) {
            return _permMedia!!
        }
        _permMedia = Builder(name = "PermMedia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(0.01f)
                lineTo(0.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(-3.5f, -4.5f)
                lineToRelative(-2.5f, 3.01f)
                lineTo(11.5f, 9.0f)
                close()
                moveTo(22.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(4.0f, 16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                lineTo(6.0f, 4.0f)
                horizontalLineToRelative(5.17f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(0.59f, 0.59f)
                lineTo(22.0f, 6.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _permMedia!!
    }

private var _permMedia: ImageVector? = null
