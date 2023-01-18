package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.IdCard: ImageVector
    get() {
        if (_idCard != null) {
            return _idCard!!
        }
        _idCard = Builder(name = "IdCard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 16.0f)
                horizontalLineTo(144.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 80.0f, 80.0f)
                verticalLineTo(432.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(368.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 368.0f, 16.0f)
                close()
                moveTo(333.48f, 284.51f)
                curveToRelative(7.57f, 8.17f, 11.27f, 19.16f, 10.39f, 30.94f)
                curveTo(342.14f, 338.91f, 324.25f, 358.0f, 304.0f, 358.0f)
                reflectiveCurveToRelative(-38.17f, -19.09f, -39.88f, -42.55f)
                curveToRelative(-0.86f, -11.9f, 2.81f, -22.91f, 10.34f, -31.0f)
                reflectiveCurveTo(292.4f, 272.0f, 304.0f, 272.0f)
                arcTo(39.65f, 39.65f, 0.0f, false, true, 333.48f, 284.51f)
                close()
                moveTo(192.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 80.0f)
                close()
                moveTo(381.0f, 443.83f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, -9.31f, 4.17f)
                horizontalLineTo(236.31f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, true, -9.31f, -4.17f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -2.76f, -10.92f)
                curveToRelative(3.25f, -17.56f, 13.38f, -32.31f, 29.3f, -42.66f)
                curveTo(267.68f, 381.06f, 285.6f, 376.0f, 304.0f, 376.0f)
                reflectiveCurveToRelative(36.32f, 5.06f, 50.46f, 14.25f)
                curveToRelative(15.92f, 10.35f, 26.05f, 25.1f, 29.3f, 42.66f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 381.0f, 443.83f)
                close()
            }
        }
        .build()
        return _idCard!!
    }

private var _idCard: ImageVector? = null
