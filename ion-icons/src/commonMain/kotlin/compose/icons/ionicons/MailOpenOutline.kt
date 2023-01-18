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

public val IonIcons.MailOpenOutline: ImageVector
    get() {
        if (_mailOpenOutline != null) {
            return _mailOpenOutline!!
        }
        _mailOpenOutline = Builder(name = "MailOpenOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(441.6f, 171.61f)
                lineTo(266.87f, 85.37f)
                arcToRelative(24.57f, 24.57f, 0.0f, false, false, -21.74f, 0.0f)
                lineTo(70.4f, 171.61f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 48.0f, 207.39f)
                verticalLineTo(392.0f)
                curveToRelative(0.0f, 22.09f, 18.14f, 40.0f, 40.52f, 40.0f)
                horizontalLineToRelative(335.0f)
                curveToRelative(22.38f, 0.0f, 40.52f, -17.91f, 40.52f, -40.0f)
                verticalLineTo(207.39f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 441.6f, 171.61f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(397.33f, 368.0f)
                lineTo(268.07f, 267.46f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -29.47f, 0.0f)
                lineTo(109.33f, 368.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(309.33f, 295.0f)
                lineTo(445.33f, 192.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(61.33f, 192.0f)
                lineTo(200.33f, 297.0f)
            }
        }
        .build()
        return _mailOpenOutline!!
    }

private var _mailOpenOutline: ImageVector? = null
