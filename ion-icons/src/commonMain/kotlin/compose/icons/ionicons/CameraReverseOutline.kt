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

public val IonIcons.CameraReverseOutline: ImageVector
    get() {
        if (_cameraReverseOutline != null) {
            return _cameraReverseOutline!!
        }
        _cameraReverseOutline = Builder(name = "CameraReverseOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(350.54f, 148.68f)
                lineToRelative(-26.62f, -42.06f)
                curveTo(318.31f, 100.08f, 310.62f, 96.0f, 302.0f, 96.0f)
                horizontalLineTo(210.0f)
                curveToRelative(-8.62f, 0.0f, -16.31f, 4.08f, -21.92f, 10.62f)
                lineToRelative(-26.62f, 42.06f)
                curveTo(155.85f, 155.23f, 148.62f, 160.0f, 140.0f, 160.0f)
                horizontalLineTo(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineTo(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(432.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                horizontalLineTo(373.0f)
                curveTo(364.35f, 160.0f, 356.15f, 155.23f, 350.54f, 148.68f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(124.0f, 158.0f)
                lineToRelative(0.0f, -22.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(0.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(335.76f, 285.22f)
                verticalLineTo(271.91f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -131.0f, -61.6f)
                moveTo(176.0f, 258.78f)
                verticalLineToRelative(13.31f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 130.73f, 61.8f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(196.0f, 272.0f)
                lineToRelative(-20.0f, -20.0f)
                lineToRelative(-20.0f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(356.0f, 272.0f)
                lineToRelative(-20.0f, 20.0f)
                lineToRelative(-20.0f, -20.0f)
            }
        }
        .build()
        return _cameraReverseOutline!!
    }

private var _cameraReverseOutline: ImageVector? = null
