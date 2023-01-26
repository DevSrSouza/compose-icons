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

public val OutlineGroup.Highlight: ImageVector
    get() {
        if (_highlight != null) {
            return _highlight!!
        }
        _highlight = Builder(name = "Highlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.17f)
                lineToRelative(-3.0f, 3.0f)
                lineTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.83f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(3.502f, 5.874f)
                lineTo(4.916f, 4.46f)
                lineToRelative(2.122f, 2.12f)
                lineToRelative(-1.414f, 1.415f)
                close()
                moveTo(16.96f, 6.582f)
                lineToRelative(2.123f, -2.12f)
                lineToRelative(1.413f, 1.416f)
                lineToRelative(-2.123f, 2.12f)
                close()
            }
        }
        .build()
        return _highlight!!
    }

private var _highlight: ImageVector? = null
