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

public val IonIcons.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.9f, 136.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.91f)
                lineTo(288.16f, 40.65f)
                arcToRelative(64.14f, 64.14f, 0.0f, false, false, -64.33f, 0.0f)
                lineTo(71.12f, 129.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.91f)
                lineTo(254.0f, 243.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.06f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.0f, 163.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 167.0f)
                verticalLineTo(340.89f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 23.84f, 41.39f)
                lineTo(234.0f, 479.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -3.46f)
                verticalLineTo(274.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, -3.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 275.0f)
                verticalLineToRelative(201.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 3.46f)
                lineToRelative(162.15f, -97.23f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 464.0f, 340.89f)
                verticalLineTo(167.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, -3.45f)
                lineToRelative(-184.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 272.0f, 275.0f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
