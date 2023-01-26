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

public val OutlineGroup.Score: ImageVector
    get() {
        if (_score != null) {
            return _score!!
        }
        _score = Builder(name = "Score", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(6.0f, -6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 10.5f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(13.5f, 9.0f)
                lineTo(13.5f, 6.0f)
                lineTo(12.0f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(17.2f, 12.0f)
                lineToRelative(-2.0f, -3.0f)
                lineToRelative(2.0f, -3.0f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-2.0f, 3.0f)
                lineToRelative(2.0f, 3.0f)
                close()
                moveTo(11.0f, 10.5f)
                lineTo(8.5f, 10.5f)
                verticalLineToRelative(-0.75f)
                lineTo(11.0f, 9.75f)
                lineTo(11.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(0.75f)
                lineTo(7.0f, 8.25f)
                lineTo(7.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _score!!
    }

private var _score: ImageVector? = null
