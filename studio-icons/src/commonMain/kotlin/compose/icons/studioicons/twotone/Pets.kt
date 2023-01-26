package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Pets: ImageVector
    get() {
        if (_pets != null) {
            return _pets!!
        }
        _pets = Builder(name = "Pets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 9.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 9.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.34f, 14.86f)
                curveToRelative(-0.87f, -1.02f, -1.6f, -1.89f, -2.48f, -2.91f)
                curveToRelative(-0.46f, -0.54f, -1.05f, -1.08f, -1.75f, -1.32f)
                curveToRelative(-0.11f, -0.04f, -0.22f, -0.07f, -0.33f, -0.09f)
                curveToRelative(-0.25f, -0.04f, -0.52f, -0.04f, -0.78f, -0.04f)
                reflectiveCurveToRelative(-0.53f, 0.0f, -0.79f, 0.05f)
                curveToRelative(-0.11f, 0.02f, -0.22f, 0.05f, -0.33f, 0.09f)
                curveToRelative(-0.7f, 0.24f, -1.28f, 0.78f, -1.75f, 1.32f)
                curveToRelative(-0.87f, 1.02f, -1.6f, 1.89f, -2.48f, 2.91f)
                curveToRelative(-1.31f, 1.31f, -2.92f, 2.76f, -2.62f, 4.79f)
                curveToRelative(0.29f, 1.02f, 1.02f, 2.03f, 2.33f, 2.32f)
                curveToRelative(0.73f, 0.15f, 3.06f, -0.44f, 5.54f, -0.44f)
                horizontalLineToRelative(0.18f)
                curveToRelative(2.48f, 0.0f, 4.81f, 0.58f, 5.54f, 0.44f)
                curveToRelative(1.31f, -0.29f, 2.04f, -1.31f, 2.33f, -2.32f)
                curveToRelative(0.31f, -2.04f, -1.3f, -3.49f, -2.61f, -4.8f)
                close()
            }
        }
        .build()
        return _pets!!
    }

private var _pets: ImageVector? = null
