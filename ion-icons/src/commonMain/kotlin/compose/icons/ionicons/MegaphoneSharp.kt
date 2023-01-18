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

public val IonIcons.MegaphoneSharp: ImageVector
    get() {
        if (_megaphoneSharp != null) {
            return _megaphoneSharp!!
        }
        _megaphoneSharp = Builder(name = "MegaphoneSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 144.0f)
                verticalLineTo(476.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(232.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.82f, -9.7f)
                lineTo(208.71f, 352.0f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(452.18f, 186.55f)
                lineTo(448.0f, 185.5f)
                verticalLineTo(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(401.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.63f, 1.0f)
                lineTo(272.0f, 144.0f)
                verticalLineTo(304.0f)
                lineTo(398.87f, 415.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.63f, 1.0f)
                horizontalLineTo(444.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(262.5f)
                lineToRelative(4.18f, -1.05f)
                curveTo(461.8f, 258.84f, 480.0f, 247.67f, 480.0f, 224.0f)
                reflectiveCurveTo(461.8f, 189.16f, 452.18f, 186.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 144.0f)
                horizontalLineTo(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(35.59f)
                arcToRelative(43.0f, 43.0f, 0.0f, false, false, -4.24f, 4.35f)
                curveTo(38.4f, 194.32f, 32.0f, 205.74f, 32.0f, 224.0f)
                curveToRelative(0.0f, 20.19f, 7.89f, 33.13f, 16.0f, 40.42f)
                verticalLineTo(300.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(96.0f)
                close()
            }
        }
        .build()
        return _megaphoneSharp!!
    }

private var _megaphoneSharp: ImageVector? = null
