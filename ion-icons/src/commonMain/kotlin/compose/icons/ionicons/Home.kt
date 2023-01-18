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

public val IonIcons.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(261.56f, 101.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.06f, 0.0f)
                lineTo(66.4f, 277.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.47f, 5.79f)
                lineTo(63.9f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(328.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineToRelative(0.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(96.06f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineToRelative(0.0f, -165.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.47f, -5.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.91f, 244.15f)
                lineToRelative(-74.8f, -71.56f)
                lineToRelative(0.0f, -108.59f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineToRelative(0.0f, 32.0f)
                lineTo(278.19f, 40.62f)
                curveTo(272.77f, 35.14f, 264.71f, 32.0f, 256.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-8.68f, 0.0f, -16.72f, 3.14f, -22.14f, 8.63f)
                lineTo(21.16f, 244.13f)
                curveToRelative(-6.22f, 6.0f, -7.0f, 15.87f, -1.34f, 22.37f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 43.0f, 267.56f)
                lineTo(250.5f, 69.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.06f, 0.0f)
                lineTo(469.08f, 267.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.59f, -0.44f)
                curveTo(497.81f, 260.76f, 497.3f, 250.26f, 490.91f, 244.15f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
