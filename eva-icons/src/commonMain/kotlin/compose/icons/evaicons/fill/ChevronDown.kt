package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = Builder(name = "ChevronDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.71f, -0.29f)
                lineToRelative(-4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 8.71f, 9.79f)
                lineTo(12.0f, 13.1f)
                lineToRelative(3.3f, -3.18f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.38f, 1.44f)
                lineToRelative(-4.0f, 3.86f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
