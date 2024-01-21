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

public val SimpleIcons.Apmterminals: ImageVector
    get() {
        if (_apmterminals != null) {
            return _apmterminals!!
        }
        _apmterminals = Builder(name = "Apmterminals", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.8f, 2.95f)
                lineTo(0.0f, 16.55f)
                verticalLineToRelative(4.5f)
                lineTo(24.0f, 9.32f)
                lineTo(24.0f, 2.95f)
                close()
                moveTo(24.0f, 13.05f)
                lineTo(15.13f, 17.26f)
                verticalLineToRelative(3.68f)
                lineToRelative(8.87f, -3.4f)
                close()
            }
        }
        .build()
        return _apmterminals!!
    }

private var _apmterminals: ImageVector? = null
