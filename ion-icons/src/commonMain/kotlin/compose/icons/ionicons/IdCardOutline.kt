package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.IdCardOutline: ImageVector
    get() {
        if (_idCardOutline != null) {
            return _idCardOutline!!
        }
        _idCardOutline = Builder(name = "IdCardOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 32.0f)
                lineTo(368.0f, 32.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 80.0f)
                lineTo(416.0f, 432.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 368.0f, 480.0f)
                lineTo(144.0f, 480.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 432.0f)
                lineTo(96.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 144.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                lineTo(304.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.48f, 284.51f)
                arcTo(39.65f, 39.65f, 0.0f, false, false, 304.0f, 272.0f)
                curveToRelative(-11.6f, 0.0f, -22.09f, 4.41f, -29.54f, 12.43f)
                reflectiveCurveToRelative(-11.2f, 19.12f, -10.34f, 31.0f)
                curveTo(265.83f, 338.91f, 283.72f, 358.0f, 304.0f, 358.0f)
                reflectiveCurveToRelative(38.14f, -19.09f, 39.87f, -42.55f)
                curveTo(344.75f, 303.67f, 341.05f, 292.68f, 333.48f, 284.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.69f, 448.0f)
                horizontalLineTo(236.31f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, -9.31f, -4.17f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -2.76f, -10.92f)
                curveToRelative(3.25f, -17.56f, 13.38f, -32.31f, 29.3f, -42.66f)
                curveTo(267.68f, 381.06f, 285.6f, 376.0f, 304.0f, 376.0f)
                reflectiveCurveToRelative(36.32f, 5.06f, 50.46f, 14.25f)
                curveToRelative(15.92f, 10.35f, 26.05f, 25.1f, 29.3f, 42.66f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 381.0f, 443.83f)
                arcTo(12.05f, 12.05f, 0.0f, false, true, 371.69f, 448.0f)
                close()
            }
        }
        .build()
        return _idCardOutline!!
    }

private var _idCardOutline: ImageVector? = null
