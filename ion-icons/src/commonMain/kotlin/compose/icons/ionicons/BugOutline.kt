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

public val IonIcons.BugOutline: ImageVector
    get() {
        if (_bugOutline != null) {
            return _bugOutline!!
        }
        _bugOutline = Builder(name = "BugOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(370.0f, 378.0f)
                curveToRelative(28.89f, 23.52f, 46.0f, 46.07f, 46.0f, 86.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(142.0f, 378.0f)
                curveToRelative(-28.89f, 23.52f, -46.0f, 46.06f, -46.0f, 86.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 208.0f)
                curveToRelative(28.89f, -23.52f, 32.0f, -56.07f, 32.0f, -96.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 206.0f)
                curveToRelative(-28.89f, -23.52f, -32.0f, -54.06f, -32.0f, -94.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 288.13f)
                lineTo(384.0f, 288.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 288.13f)
                lineTo(48.0f, 288.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 192.0f)
                lineTo(256.0f, 448.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-70.4f, 0.0f, -128.0f, -57.6f, -128.0f, -128.0f)
                verticalLineTo(223.93f)
                curveToRelative(0.0f, -65.07f, 57.6f, -96.0f, 128.0f, -96.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(70.4f, 0.0f, 128.0f, 25.6f, 128.0f, 96.0f)
                verticalLineTo(320.0f)
                curveTo(384.0f, 390.4f, 326.4f, 448.0f, 256.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(179.43f, 143.52f)
                arcTo(49.08f, 49.08f, 0.0f, false, true, 176.0f, 127.79f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 255.79f, 48.0f)
                horizontalLineToRelative(0.42f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 336.0f, 127.79f)
                arcToRelative(41.91f, 41.91f, 0.0f, false, true, -3.12f, 14.3f)
            }
        }
        .build()
        return _bugOutline!!
    }

private var _bugOutline: ImageVector? = null
