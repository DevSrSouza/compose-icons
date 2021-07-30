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

public val SimpleIcons.Wikidata: ImageVector
    get() {
        if (_wikidata != null) {
            return _wikidata!!
        }
        _wikidata = Builder(name = "Wikidata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.583f)
                verticalLineToRelative(14.833f)
                horizontalLineToRelative(0.865f)
                lineTo(0.865f, 4.583f)
                close()
                moveTo(1.788f, 4.583f)
                verticalLineToRelative(14.833f)
                horizontalLineToRelative(2.653f)
                lineTo(4.441f, 4.583f)
                close()
                moveTo(5.306f, 4.583f)
                verticalLineToRelative(14.832f)
                lineTo(7.96f, 19.415f)
                lineTo(7.96f, 4.583f)
                close()
                moveTo(8.853f, 4.583f)
                verticalLineToRelative(14.834f)
                horizontalLineToRelative(0.866f)
                lineTo(9.719f, 4.583f)
                close()
                moveTo(10.642f, 4.583f)
                verticalLineToRelative(14.833f)
                horizontalLineToRelative(0.865f)
                lineTo(11.507f, 4.583f)
                close()
                moveTo(12.401f, 4.583f)
                verticalLineToRelative(14.834f)
                horizontalLineToRelative(2.653f)
                lineTo(15.054f, 4.583f)
                close()
                moveTo(15.919f, 4.583f)
                verticalLineToRelative(14.834f)
                horizontalLineToRelative(0.923f)
                lineTo(16.842f, 4.583f)
                close()
                moveTo(17.707f, 4.583f)
                verticalLineToRelative(14.833f)
                horizontalLineToRelative(2.653f)
                lineTo(20.36f, 4.583f)
                close()
                moveTo(21.347f, 4.583f)
                verticalLineToRelative(14.834f)
                horizontalLineToRelative(0.865f)
                lineTo(22.212f, 4.583f)
                close()
                moveTo(23.135f, 4.583f)
                verticalLineToRelative(14.834f)
                lineTo(24.0f, 19.417f)
                lineTo(24.0f, 4.583f)
                close()
            }
        }
        .build()
        return _wikidata!!
    }

private var _wikidata: ImageVector? = null
