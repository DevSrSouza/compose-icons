package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Cplusplus: VectorAsset
    get() {
        if (_cplusplus != null) {
            return _cplusplus!!
        }
        _cplusplus = VectorAssetBuilder(name = "Cplusplus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.393f, 6.0f)
                curveToRelative(-0.167f, -0.29f, -0.398f, -0.543f, -0.652f, -0.69f)
                lineTo(12.925f, 0.22f)
                curveToRelative(-0.508f, -0.293f, -1.339f, -0.293f, -1.847f, 0.0f)
                lineTo(2.26f, 5.31f)
                curveToRelative(-0.508f, 0.293f, -0.923f, 1.013f, -0.923f, 1.6f)
                verticalLineToRelative(10.18f)
                curveToRelative(0.0f, 0.294f, 0.104f, 0.62f, 0.271f, 0.91f)
                curveToRelative(0.167f, 0.29f, 0.398f, 0.543f, 0.652f, 0.689f)
                lineToRelative(8.816f, 5.091f)
                curveToRelative(0.508f, 0.293f, 1.339f, 0.293f, 1.847f, 0.0f)
                lineToRelative(8.816f, -5.091f)
                curveToRelative(0.254f, -0.146f, 0.485f, -0.399f, 0.652f, -0.689f)
                reflectiveCurveToRelative(0.271f, -0.616f, 0.271f, -0.91f)
                lineTo(22.662f, 6.91f)
                curveToRelative(0.002f, -0.294f, -0.102f, -0.62f, -0.269f, -0.91f)
                close()
                moveTo(12.0f, 19.109f)
                curveToRelative(-3.92f, 0.0f, -7.109f, -3.189f, -7.109f, -7.109f)
                reflectiveCurveTo(8.08f, 4.891f, 12.0f, 4.891f)
                arcToRelative(7.133f, 7.133f, 0.0f, false, true, 6.156f, 3.552f)
                lineToRelative(-3.076f, 1.781f)
                arcTo(3.567f, 3.567f, 0.0f, false, false, 12.0f, 8.445f)
                curveToRelative(-1.96f, 0.0f, -3.554f, 1.595f, -3.554f, 3.555f)
                reflectiveCurveTo(10.04f, 15.555f, 12.0f, 15.555f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 3.08f, -1.778f)
                lineToRelative(3.077f, 1.78f)
                arcTo(7.135f, 7.135f, 0.0f, false, true, 12.0f, 19.109f)
                close()
                moveTo(19.109f, 12.395f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(0.79f)
                close()
                moveTo(22.071f, 12.395f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(-0.79f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(-0.789f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.789f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(0.79f)
                verticalLineToRelative(0.79f)
                close()
            }
        }
        .build()
        return _cplusplus!!
    }

private var _cplusplus: VectorAsset? = null
