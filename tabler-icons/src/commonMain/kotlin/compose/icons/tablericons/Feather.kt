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

public val TablerIcons.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                lineToRelative(10.0f, -10.0f)
                moveToRelative(0.0f, -5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                moveToRelative(-9.0f, -1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                moveToRelative(-9.0f, -1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                moveToRelative(-5.0f, -5.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveToRelative(0.638f, -0.636f, 1.0f, -1.515f, 1.0f, -2.486f)
                arcToRelative(3.515f, 3.515f, 0.0f, false, false, -3.517f, -3.514f)
                curveToRelative(-0.97f, 0.0f, -1.847f, 0.367f, -2.483f, 1.0f)
                moveToRelative(-3.0f, 13.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
