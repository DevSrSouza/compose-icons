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

public val IonIcons.Language: ImageVector
    get() {
        if (_language != null) {
            return _language!!
        }
        _language = Builder(name = "Language", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.33f, 433.6f)
                lineToRelative(-90.0f, -218.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -40.67f, 0.0f)
                lineToRelative(-90.0f, 218.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 40.67f, 16.79f)
                lineTo(316.66f, 406.0f)
                horizontalLineTo(419.33f)
                lineToRelative(18.33f, 44.39f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 458.0f, 464.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 20.32f, -30.4f)
                close()
                moveTo(334.83f, 362.0f)
                lineTo(368.0f, 281.65f)
                lineTo(401.17f, 362.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(267.84f, 342.92f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -4.89f, -30.7f)
                curveToRelative(-0.2f, -0.15f, -15.0f, -11.13f, -36.49f, -34.73f)
                curveToRelative(39.65f, -53.68f, 62.11f, -114.75f, 71.27f, -143.49f)
                horizontalLineTo(330.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                horizontalLineTo(214.0f)
                verticalLineTo(70.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -44.0f, 0.0f)
                verticalLineTo(90.0f)
                horizontalLineTo(54.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 44.0f)
                horizontalLineTo(251.25f)
                curveToRelative(-9.52f, 26.95f, -27.05f, 69.5f, -53.79f, 108.36f)
                curveToRelative(-31.41f, -41.68f, -43.08f, -68.65f, -43.17f, -68.87f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -40.58f, 17.0f)
                curveToRelative(0.58f, 1.38f, 14.55f, 34.23f, 52.86f, 83.93f)
                curveToRelative(0.92f, 1.19f, 1.83f, 2.35f, 2.74f, 3.51f)
                curveToRelative(-39.24f, 44.35f, -77.74f, 71.86f, -93.85f, 80.74f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 21.07f, 38.63f)
                curveToRelative(2.16f, -1.18f, 48.6f, -26.89f, 101.63f, -85.59f)
                curveToRelative(22.52f, 24.08f, 38.0f, 35.44f, 38.93f, 36.1f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 30.75f, -4.9f)
                close()
            }
        }
        .build()
        return _language!!
    }

private var _language: ImageVector? = null
