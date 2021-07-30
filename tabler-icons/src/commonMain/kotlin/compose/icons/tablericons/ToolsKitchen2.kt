package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ToolsKitchen2: ImageVector
    get() {
        if (_toolsKitchen2 != null) {
            return _toolsKitchen2!!
        }
        _toolsKitchen2 = Builder(name = "ToolsKitchen2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.023f, -3.681f, 0.184f, -7.406f, 5.0f, -12.0f)
                close()
                moveTo(19.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                moveToRelative(-10.0f, -14.0f)
                verticalLineToRelative(17.0f)
                moveToRelative(-3.0f, -17.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 6.0f, 0.0f)
                verticalLineToRelative(-3.0f)
            }
        }
        .build()
        return _toolsKitchen2!!
    }

private var _toolsKitchen2: ImageVector? = null
