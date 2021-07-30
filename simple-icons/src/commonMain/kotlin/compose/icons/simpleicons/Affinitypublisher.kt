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

public val SimpleIcons.Affinitypublisher: ImageVector
    get() {
        if (_affinitypublisher != null) {
            return _affinitypublisher!!
        }
        _affinitypublisher = Builder(name = "Affinitypublisher", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.44f, 0.0f)
                lineTo(9.36f, 1.87f)
                lineTo(22.136f, 24.0f)
                horizontalLineToRelative(1.144f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.72f, -0.72f)
                verticalLineToRelative(-3.119f)
                lineTo(12.36f, 0.0f)
                close()
                moveTo(13.44f, 0.0f)
                lineTo(24.0f, 18.29f)
                lineTo(24.0f, 0.72f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, -0.72f, -0.72f)
                close()
                moveTo(8.82f, 2.806f)
                lineToRelative(-1.98f, 3.43f)
                lineTo(16.976f, 24.0f)
                horizontalLineToRelative(4.08f)
                close()
                moveTo(6.24f, 7.274f)
                lineTo(4.76f, 9.837f)
                arcToRelative(1.941f, 1.941f, 0.0f, false, false, 0.0f, 1.942f)
                curveTo(6.531f, 14.842f, 11.816f, 24.0f, 11.816f, 24.0f)
                horizontalLineToRelative(4.08f)
                close()
                moveTo(3.66f, 11.744f)
                lineTo(0.0f, 18.082f)
                verticalLineToRelative(5.197f)
                curveToRelative(0.0f, 0.397f, 0.323f, 0.72f, 0.72f, 0.72f)
                horizontalLineToRelative(10.016f)
                close()
            }
        }
        .build()
        return _affinitypublisher!!
    }

private var _affinitypublisher: ImageVector? = null
