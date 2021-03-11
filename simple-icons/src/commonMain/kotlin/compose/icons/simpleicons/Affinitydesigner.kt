package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Affinitydesigner: ImageVector
    get() {
        if (_affinitydesigner != null) {
            return _affinitydesigner!!
        }
        _affinitydesigner = Builder(name = "Affinitydesigner", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.44f, 0.0f)
                lineTo(0.0f, 18.083f)
                verticalLineToRelative(5.197f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.713f, 0.72f)
                horizontalLineToRelative(10.023f)
                lineTo(5.7f, 15.277f)
                lineTo(14.52f, 0.0f)
                close()
                moveTo(15.6f, 0.0f)
                lineToRelative(-4.86f, 8.418f)
                lineToRelative(3.718f, 6.439f)
                lineTo(24.0f, 14.857f)
                lineTo(24.0f, 0.718f)
                arcTo(0.72f, 0.72f, 0.0f, false, false, 23.28f, 0.0f)
                close()
                moveTo(10.2f, 9.353f)
                lineToRelative(-2.064f, 3.575f)
                arcToRelative(1.289f, 1.289f, 0.0f, false, false, 0.0f, 1.288f)
                curveToRelative(0.23f, 0.4f, 0.656f, 0.64f, 1.117f, 0.64f)
                horizontalLineToRelative(4.125f)
                close()
                moveTo(7.078f, 15.793f)
                lineTo(11.816f, 24.0f)
                horizontalLineToRelative(11.471f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.713f, -0.718f)
                verticalLineToRelative(-7.49f)
                close()
            }
        }
        .build()
        return _affinitydesigner!!
    }

private var _affinitydesigner: ImageVector? = null
