package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.StarOff: ImageVector
    get() {
        if (_starOff != null) {
            return _starOff!!
        }
        _starOff = Builder(name = "StarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.012f, 6.016f)
                lineToRelative(1.981f, -4.014f)
                lineToRelative(3.086f, 6.253f)
                lineToRelative(6.9f, 1.0f)
                lineToRelative(-4.421f, 4.304f)
                moveToRelative(0.012f, 4.01f)
                lineToRelative(0.588f, 3.426f)
                lineToRelative(-6.158f, -3.245f)
                lineToRelative(-6.172f, 3.245f)
                lineToRelative(1.179f, -6.873f)
                lineToRelative(-5.0f, -4.867f)
                lineToRelative(6.327f, -0.917f)
            }
        }
        .build()
        return _starOff!!
    }

private var _starOff: ImageVector? = null
