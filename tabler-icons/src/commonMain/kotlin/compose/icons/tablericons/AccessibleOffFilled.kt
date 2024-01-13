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

public val TablerIcons.AccessibleOffFilled: ImageVector
    get() {
        if (_accessibleOffFilled != null) {
            return _accessibleOffFilled!!
        }
        _accessibleOffFilled = Builder(name = "AccessibleOffFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(15.949f, 10.184f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.152f, -0.663f)
                lineToRelative(-0.113f, 0.03f)
                lineToRelative(-2.684f, 0.895f)
                lineToRelative(-2.684f, -0.895f)
                lineToRelative(-0.113f, -0.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.628f, 1.884f)
                lineToRelative(0.109f, 0.044f)
                lineToRelative(2.316f, 0.771f)
                verticalLineToRelative(0.976f)
                lineToRelative(-1.832f, 2.75f)
                lineToRelative(-0.06f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.237f, 1.21f)
                lineToRelative(0.1f, 0.076f)
                lineToRelative(0.101f, 0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.21f, -0.237f)
                lineToRelative(0.076f, -0.1f)
                lineToRelative(1.168f, -1.752f)
                lineToRelative(1.168f, 1.752f)
                lineToRelative(0.07f, 0.093f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.653f, -1.102f)
                lineToRelative(-0.059f, -0.1f)
                lineToRelative(-1.832f, -2.75f)
                verticalLineToRelative(-0.977f)
                lineToRelative(2.316f, -0.771f)
                lineToRelative(0.109f, -0.044f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.524f, -1.221f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _accessibleOffFilled!!
    }

private var _accessibleOffFilled: ImageVector? = null
