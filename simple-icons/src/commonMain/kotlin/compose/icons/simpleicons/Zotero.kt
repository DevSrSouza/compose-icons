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

public val SimpleIcons.Zotero: ImageVector
    get() {
        if (_zotero != null) {
            return _zotero!!
        }
        _zotero = Builder(name = "Zotero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.231f, 2.462f)
                lineTo(7.18f, 20.923f)
                horizontalLineToRelative(14.564f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.256f)
                verticalLineToRelative(-2.462f)
                lineTo(16.308f, 3.076f)
                horizontalLineTo(2.975f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(18.256f)
                verticalLineToRelative(2.462f)
                close()
            }
        }
        .build()
        return _zotero!!
    }

private var _zotero: ImageVector? = null
