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

public val FillGroup.Globe3: ImageVector
    get() {
        if (_globe3 != null) {
            return _globe3!!
        }
        _globe3 = Builder(name = "Globe3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
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
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(5.0f, 15.8f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, false, 2.0f, 0.27f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.14f, -1.0f)
                curveToRelative(1.71f, -1.34f, 1.71f, -3.06f, 1.71f, -4.44f)
                arcToRelative(4.76f, 4.76f, 0.0f, false, true, 0.37f, -2.34f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, true, 1.12f, -0.91f)
                arcToRelative(9.75f, 9.75f, 0.0f, false, false, 0.92f, -0.61f)
                arcTo(4.55f, 4.55f, 0.0f, false, false, 15.66f, 4.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 19.0f, 8.12f)
                curveToRelative(-1.43f, 0.2f, -3.46f, 0.67f, -3.86f, 2.53f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, -0.29f, 1.47f)
                lineToRelative(-0.1f, 0.17f)
                curveToRelative(-0.65f, 1.08f, -1.38f, 2.31f, -0.39f, 4.0f)
                curveToRelative(0.12f, 0.21f, 0.25f, 0.41f, 0.38f, 0.61f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, true, 0.52f, 1.08f)
                arcTo(7.89f, 7.89f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 5.0f, 15.8f)
                close()
            }
        }
        .build()
        return _globe3!!
    }

private var _globe3: ImageVector? = null
