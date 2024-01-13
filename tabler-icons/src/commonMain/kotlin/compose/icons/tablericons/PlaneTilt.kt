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

public val TablerIcons.PlaneTilt: ImageVector
    get() {
        if (_planeTilt != null) {
            return _planeTilt!!
        }
        _planeTilt = Builder(name = "PlaneTilt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 6.5f)
                lineToRelative(3.0f, -2.9f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, 2.9f, 2.9f)
                lineToRelative(-2.9f, 3.0f)
                lineToRelative(2.5f, 7.5f)
                lineToRelative(-2.5f, 2.55f)
                lineToRelative(-3.5f, -6.55f)
                lineToRelative(-3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-1.5f, -4.5f)
                lineToRelative(-4.5f, -1.5f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-6.5f, -3.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(7.5f, 2.5f)
                close()
            }
        }
        .build()
        return _planeTilt!!
    }

private var _planeTilt: ImageVector? = null
