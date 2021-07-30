package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 12.0f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.22f, -0.09f, -0.33f)
                arcToRelative(4.17f, 4.17f, 0.0f, false, false, -0.18f, -0.57f)
                curveToRelative(-0.05f, -0.12f, -0.12f, -0.24f, -0.18f, -0.37f)
                reflectiveCurveToRelative(-0.15f, -0.3f, -0.24f, -0.44f)
                reflectiveCurveTo(21.0f, 10.08f, 21.0f, 10.0f)
                reflectiveCurveToRelative(-0.2f, -0.25f, -0.31f, -0.37f)
                reflectiveCurveToRelative(-0.21f, -0.2f, -0.32f, -0.3f)
                lineTo(20.0f, 9.0f)
                lineToRelative(-0.36f, -0.24f)
                arcToRelative(3.68f, 3.68f, 0.0f, false, false, -0.44f, -0.23f)
                lineToRelative(-0.39f, -0.18f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, false, -0.5f, -0.15f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.41f, -0.09f)
                lineTo(17.67f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.33f, 8.0f)
                lineToRelative(-0.18f, 0.05f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.41f, 0.09f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, false, -0.5f, 0.15f)
                lineToRelative(-0.39f, 0.18f)
                arcToRelative(3.68f, 3.68f, 0.0f, false, false, -0.44f, 0.23f)
                lineTo(4.05f, 9.0f)
                lineToRelative(-0.37f, 0.31f)
                curveToRelative(-0.11f, 0.1f, -0.22f, 0.19f, -0.32f, 0.3f)
                reflectiveCurveToRelative(-0.21f, 0.25f, -0.31f, 0.37f)
                reflectiveCurveToRelative(-0.18f, 0.23f, -0.26f, 0.36f)
                reflectiveCurveToRelative(-0.16f, 0.29f, -0.24f, 0.44f)
                reflectiveCurveToRelative(-0.13f, 0.25f, -0.18f, 0.37f)
                arcToRelative(4.17f, 4.17f, 0.0f, false, false, -0.18f, 0.57f)
                curveToRelative(0.0f, 0.11f, -0.07f, 0.22f, -0.09f, 0.33f)
                arcTo(5.23f, 5.23f, 0.0f, false, false, 2.0f, 13.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.09f, 0.91f)
                curveToRelative(0.0f, 0.1f, 0.05f, 0.19f, 0.07f, 0.29f)
                arcToRelative(5.58f, 5.58f, 0.0f, false, false, 0.18f, 0.58f)
                lineToRelative(0.12f, 0.29f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.3f, 0.56f)
                lineToRelative(0.14f, 0.22f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.05f, 0.08f)
                lineTo(3.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(16.63f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 0.27f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -1.44f, -0.61f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.05f, -2.83f)
                lineToRelative(3.0f, -2.9f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.59f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.82f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 17.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -1.0f, -0.27f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.0f, -2.0f)
                lineToRelative(0.05f, -0.05f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.05f, -0.08f)
                lineToRelative(0.14f, -0.22f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.3f, -0.56f)
                lineToRelative(0.12f, -0.29f)
                arcToRelative(5.58f, 5.58f, 0.0f, false, false, 0.18f, -0.58f)
                curveToRelative(0.0f, -0.1f, 0.05f, -0.19f, 0.07f, -0.29f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 22.0f, 13.0f)
                arcTo(5.23f, 5.23f, 0.0f, false, false, 21.9f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.71f, 11.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-3.0f, 2.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.38f, 1.44f)
                lineTo(11.0f, 14.36f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(14.41f)
                lineToRelative(1.29f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
