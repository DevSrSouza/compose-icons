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

public val TablerIcons.Hanger: ImageVector
    get() {
        if (_hanger != null) {
            return _hanger!!
        }
        _hanger = Builder(name = "Hanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                curveToRelative(0.0f, 1.667f, 0.67f, 3.0f, 2.0f, 4.0f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(7.971f, 4.428f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.029f, 1.749f)
                verticalLineToRelative(0.823f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-0.823f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.029f, -1.749f)
                lineToRelative(7.971f, -4.428f)
            }
        }
        .build()
        return _hanger!!
    }

private var _hanger: ImageVector? = null
