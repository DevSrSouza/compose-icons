package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) {
            return _navigationArrow!!
        }
        _navigationArrow = Builder(name = "NavigationArrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.3f, 103.8f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -11.3f, 15.0f)
                lineToRelative(-76.6f, 23.6f)
                lineTo(118.8f, 219.0f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -15.0f, 11.2f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -15.1f, -10.8f)
                lineTo(29.8f, 50.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 50.2f, 29.8f)
                lineTo(219.5f, 88.4f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 230.3f, 103.8f)
                close()
            }
        }
        .build()
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
