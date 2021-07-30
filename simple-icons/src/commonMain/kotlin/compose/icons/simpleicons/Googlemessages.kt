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

public val SimpleIcons.Googlemessages: ImageVector
    get() {
        if (_googlemessages != null) {
            return _googlemessages!!
        }
        _googlemessages = Builder(name = "Googlemessages", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.92f, 3.332f)
                curveToRelative(-0.776f, 0.0f, -1.216f, 0.67f, -0.692f, 1.383f)
                lineToRelative(2.537f, 4.403f)
                verticalLineToRelative(7.86f)
                curveToRelative(0.0f, 2.013f, 1.467f, 3.69f, 3.459f, 3.69f)
                lineTo(20.31f, 20.668f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 3.69f, -3.69f)
                lineTo(24.0f, 7.043f)
                arcToRelative(3.723f, 3.723f, 0.0f, false, false, -3.668f, -3.71f)
                close()
                moveTo(6.706f, 7.042f)
                lineTo(20.1f, 7.042f)
                curveToRelative(0.587f, 0.0f, 1.153f, 0.357f, 1.153f, 0.923f)
                curveToRelative(0.0f, 0.566f, -0.566f, 0.922f, -1.153f, 0.922f)
                lineTo(6.706f, 8.887f)
                curveToRelative(-0.587f, 0.0f, -1.153f, -0.356f, -1.153f, -0.922f)
                curveToRelative(0.0f, -0.566f, 0.566f, -0.923f, 1.153f, -0.923f)
                close()
                moveTo(6.706f, 10.732f)
                lineTo(20.1f, 10.732f)
                curveToRelative(0.587f, 0.0f, 1.153f, 0.356f, 1.153f, 0.922f)
                curveToRelative(0.0f, 0.566f, -0.566f, 0.922f, -1.153f, 0.922f)
                lineTo(6.706f, 12.576f)
                curveToRelative(-0.587f, 0.0f, -1.153f, -0.356f, -1.153f, -0.922f)
                curveToRelative(0.0f, -0.566f, 0.566f, -0.922f, 1.153f, -0.922f)
                close()
                moveTo(6.685f, 14.442f)
                horizontalLineToRelative(9.705f)
                curveToRelative(0.587f, 0.0f, 1.153f, 0.356f, 1.153f, 0.922f)
                curveToRelative(0.0f, 0.566f, -0.566f, 0.923f, -1.153f, 0.923f)
                lineTo(6.685f, 16.287f)
                curveToRelative(-0.587f, 0.0f, -1.153f, -0.357f, -1.153f, -0.923f)
                curveToRelative(0.0f, -0.566f, 0.566f, -0.922f, 1.153f, -0.922f)
                close()
            }
        }
        .build()
        return _googlemessages!!
    }

private var _googlemessages: ImageVector? = null
