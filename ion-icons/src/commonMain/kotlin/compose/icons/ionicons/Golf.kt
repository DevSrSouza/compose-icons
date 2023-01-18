package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 320.46f)
                verticalLineTo(202.3f)
                lineToRelative(166.62f, -75.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -29.14f)
                lineToRelative(-176.0f, -80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 32.0f)
                verticalLineTo(191.66f)
                curveToRelative(0.0f, 0.23f, 0.0f, 0.47f, 0.0f, 0.7f)
                verticalLineToRelative(128.1f)
                quadToRelative(8.0f, -0.45f, 16.0f, -0.46f)
                reflectiveQuadTo(272.0f, 320.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.33f, 457.5f)
                curveToRelative(-8.56f, -42.85f, -35.11f, -78.74f, -76.78f, -103.8f)
                curveTo(354.05f, 334.15f, 313.88f, 322.4f, 272.0f, 320.0f)
                verticalLineToRelative(79.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
                verticalLineTo(320.0f)
                curveToRelative(-41.88f, 2.4f, -82.05f, 14.15f, -114.55f, 33.7f)
                curveToRelative(-41.67f, 25.06f, -68.22f, 60.95f, -76.78f, 103.8f)
                arcToRelative(32.49f, 32.49f, 0.0f, false, false, 6.44f, 27.08f)
                curveTo(61.13f, 492.0f, 70.0f, 496.0f, 80.0f, 496.0f)
                horizontalLineTo(432.0f)
                curveToRelative(10.0f, 0.0f, 18.88f, -4.05f, 24.9f, -11.42f)
                arcTo(32.49f, 32.49f, 0.0f, false, false, 463.33f, 457.5f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
