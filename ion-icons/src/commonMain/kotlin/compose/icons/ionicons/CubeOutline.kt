package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CubeOutline: ImageVector
    get() {
        if (_cubeOutline != null) {
            return _cubeOutline!!
        }
        _cubeOutline = Builder(name = "CubeOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 341.37f)
                verticalLineTo(170.61f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 432.11f, 143.0f)
                lineToRelative(-152.0f, -88.46f)
                arcToRelative(47.94f, 47.94f, 0.0f, false, false, -48.24f, 0.0f)
                lineTo(79.89f, 143.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 170.61f)
                verticalLineTo(341.37f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 79.89f, 369.0f)
                lineToRelative(152.0f, 88.46f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.24f, 0.0f)
                lineToRelative(152.0f, -88.46f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 448.0f, 341.37f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(69.0f, 153.99f)
                lineToRelative(187.0f, 110.0f)
                lineToRelative(187.0f, -110.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 463.99f)
                lineTo(256.0f, 263.99f)
            }
        }
        .build()
        return _cubeOutline!!
    }

private var _cubeOutline: ImageVector? = null
